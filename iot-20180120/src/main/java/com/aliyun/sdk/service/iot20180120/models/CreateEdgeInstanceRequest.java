// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeInstanceRequest</p>
 */
public class CreateEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    private Integer spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private CreateEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.spec = builder.spec;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spec
     */
    public Integer getSpec() {
        return this.spec;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateEdgeInstanceRequest, Builder> {
        private String iotInstanceId; 
        private String name; 
        private Integer spec; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeInstanceRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.spec = request.spec;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The name of the edge instance.</p>
         * <p>An instance name cannot exceed 20 characters in length and can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LinkIoTEdge_Node</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The specification of the edge instance.</p>
         * <ul>
         * <li>10: Lite Edition.</li>
         * <li>20: Standard Edition.</li>
         * <li>30: Pro Edition.</li>
         * </ul>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder spec(Integer spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The tags of the edge instance. Syntax of a tag: <code>key:value</code>. Multiple tags are separated with commas (,), for example, <code>k1:v1,k2:v2</code>.</p>
         * <ul>
         * <li><p>Note the following limits on tag keys:</p>
         * <ul>
         * <li>Tag values cannot be left empty.</li>
         * <li>Tag keys must be unique in the edge instance.</li>
         * <li>Tag keys only support letters.</li>
         * <li>Each tag key cannot exceed 20 characters in length.</li>
         * </ul>
         * </li>
         * <li><p>Note the following limits on tag values:</p>
         * <ul>
         * <li>Tag values cannot be left empty.</li>
         * <li>A tag value can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-).</li>
         * <li>Each tag value cannot exceed 20 characters in length.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k1:v1,k2:v2</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateEdgeInstanceRequest build() {
            return new CreateEdgeInstanceRequest(this);
        } 

    } 

}
