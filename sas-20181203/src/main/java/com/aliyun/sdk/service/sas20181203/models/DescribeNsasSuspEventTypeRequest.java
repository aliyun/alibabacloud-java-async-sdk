// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeNsasSuspEventTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeNsasSuspEventTypeRequest</p>
 */
public class DescribeNsasSuspEventTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAccountActionType")
    private Integer multiAccountActionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private DescribeNsasSuspEventTypeRequest(Builder builder) {
        super(builder);
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.from = builder.from;
        this.lang = builder.lang;
        this.multiAccountActionType = builder.multiAccountActionType;
        this.name = builder.name;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNsasSuspEventTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return multiAccountActionType
     */
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeNsasSuspEventTypeRequest, Builder> {
        private String containerFieldName; 
        private String containerFieldValue; 
        private String from; 
        private String lang; 
        private Integer multiAccountActionType; 
        private String name; 
        private String remark; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNsasSuspEventTypeRequest request) {
            super(request);
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.from = request.from;
            this.lang = request.lang;
            this.multiAccountActionType = request.multiAccountActionType;
            this.name = request.name;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The name of the container field. Valid values:</p>
         * <ul>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the container field.</p>
         * 
         * <strong>example:</strong>
         * <p>ca3108551c83c4d949106e1ab9e1e****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to <strong>sas</strong>, which indicates that the request is sent from Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The type of the accounts that you want to query. Default value: <strong>0</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the current account.</li>
         * <li><strong>1</strong>: all accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder multiAccountActionType(Integer multiAccountActionType) {
            this.putQueryParameter("MultiAccountActionType", multiAccountActionType);
            this.multiAccountActionType = multiAccountActionType;
            return this;
        }

        /**
         * <p>The name of the alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>testECS</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>180.212.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f56406cb-916d-42db-b6f7-2ff79e34****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeNsasSuspEventTypeRequest build() {
            return new DescribeNsasSuspEventTypeRequest(this);
        } 

    } 

}
