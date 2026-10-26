// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResourceResponseBody</p>
 */
public class GetInstanceResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private GetInstanceResourceResponseBody(Builder builder) {
        this.category = builder.category;
        this.config = builder.config;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.group = builder.group;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String category; 
        private String config; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String group; 
        private String requestId; 
        private String resourceId; 
        private String type; 
        private String uri; 

        private Builder() {
        } 

        private Builder(GetInstanceResourceResponseBody model) {
            this.category = model.category;
            this.config = model.config;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.group = model.group;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.type = model.type;
            this.uri = model.uri;
        } 

        /**
         * <p>The resource category. Valid values:</p>
         * <ul>
         * <li>DataManagement</li>
         * <li>Engine</li>
         * <li>Monitor</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataManagement</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The configuration information of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The creation time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13 17:34:52</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The update time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13 17:34:52</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The resource group.</p>
         * <p>If the resource category is DataManagement, valid values are:</p>
         * <ul>
         * <li>storage</li>
         * <li>modelpipeline</li>
         * <li>datastorage</li>
         * <li>modeltrain</li>
         * </ul>
         * <p>If the resource category is Engine, valid values are:</p>
         * <ul>
         * <li>feature</li>
         * <li>predict</li>
         * <li>recall</li>
         * <li>recengine</li>
         * </ul>
         * <p>If the resource category is Monitor, valid values are:</p>
         * <ul>
         * <li>logs</li>
         * <li>logsback</li>
         * <li>coldstart</li>
         * <li>deploy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D75C43DC-3D3A-5CC8-9AAC-8C77306C433B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>reso-2s416t***</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>Hologres</li>
         * <li>EAS</li>
         * <li>BE</li>
         * <li>Rec</li>
         * <li>Platform</li>
         * <li>SLS</li>
         * <li>DataHub</li>
         * <li>Kafka</li>
         * <li>Flinkvvp</li>
         * <li>ACR</li>
         * <li>OSS</li>
         * <li>DataWorks</li>
         * <li>PAI</li>
         * <li>MaxCompute</li>
         * <li>GraphCompute</li>
         * <li>Redis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The resource URI.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-test-123</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetInstanceResourceResponseBody build() {
            return new GetInstanceResourceResponseBody(this);
        } 

    } 

}
