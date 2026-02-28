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
 * {@link UpdateEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeInstanceRequest</p>
 */
public class UpdateEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizEnable")
    private Boolean bizEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    private UpdateEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.bizEnable = builder.bizEnable;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.spec = builder.spec;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizEnable
     */
    public Boolean getBizEnable() {
        return this.bizEnable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateEdgeInstanceRequest, Builder> {
        private Boolean bizEnable; 
        private String instanceId; 
        private String iotInstanceId; 
        private String name; 
        private Integer spec; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeInstanceRequest request) {
            super(request);
            this.bizEnable = request.bizEnable;
            this.instanceId = request.instanceId;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.spec = request.spec;
            this.tags = request.tags;
        } 

        /**
         * <p>Specifies whether to enable the edge instance. Valid values:</p>
         * <ul>
         * <li>true: enables the edge instance.</li>
         * <li>false: disables the edge instance.</li>
         * </ul>
         * <p>If you do not set this parameter, this parameter is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder bizEnable(Boolean bizEnable) {
            this.putQueryParameter("BizEnable", bizEnable);
            this.bizEnable = bizEnable;
            return this;
        }

        /**
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance that you want to update and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
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
         * <p>The name can be up to 20 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
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
         * <p>The specifications of the edge instance. Valid values:</p>
         * <ul>
         * <li>10: Lite Edition</li>
         * <li>20: Standard Edition</li>
         * <li>30: Pro Edition</li>
         * </ul>
         * <p>If you do not set this parameter, this parameter is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder spec(Integer spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * <p>The tags of the edge instance. Each tag is a key-value pair. Multiple tags are separated with commas (,). Example: <code>k1:v1,k2:v2</code>.</p>
         * <ul>
         * <li><p>Take note of the following limits on tag keys:</p>
         * <ul>
         * <li>Tag keys cannot be left empty.</li>
         * <li>Tag keys must be unique in the edge instance.</li>
         * <li>Tag keys support only letters.</li>
         * <li>Each tag key can be up to 20 characters in length.</li>
         * </ul>
         * </li>
         * <li><p>Take note of the following limits on tag values:</p>
         * <ul>
         * <li>Tag values cannot be left empty.</li>
         * <li>A tag value can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>Each tag value can be up to 20 characters in length.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>If you do not set this parameter, this parameter is not updated.</p>
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
        public UpdateEdgeInstanceRequest build() {
            return new UpdateEdgeInstanceRequest(this);
        } 

    } 

}
