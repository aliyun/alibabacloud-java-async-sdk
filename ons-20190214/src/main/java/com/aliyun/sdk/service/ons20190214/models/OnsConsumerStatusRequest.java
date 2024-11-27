// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsConsumerStatusRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerStatusRequest</p>
 */
public class OnsConsumerStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private Boolean detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedJstack")
    private Boolean needJstack;

    private OnsConsumerStatusRequest(Builder builder) {
        super(builder);
        this.detail = builder.detail;
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.needJstack = builder.needJstack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Boolean getDetail() {
        return this.detail;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needJstack
     */
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

    public static final class Builder extends Request.Builder<OnsConsumerStatusRequest, Builder> {
        private Boolean detail; 
        private String groupId; 
        private String instanceId; 
        private Boolean needJstack; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerStatusRequest request) {
            super(request);
            this.detail = request.detail;
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.needJstack = request.needJstack;
        } 

        /**
         * <p>Specifies whether to query the details of the consumer group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The details of the consumer group are queried. You can obtain details from the <strong>ConsumerConnectionInfoList</strong> and <strong>DetailInTopicList</strong> response parameters.</li>
         * <li><strong>false</strong>: The details of the consumer group are not queried. The values of the <strong>ConsumerConnectionInfoList</strong> and <strong>DetailInTopicList</strong> response parameters are empty. This value is the default value of the Detail parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder detail(Boolean detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>The ID of the consumer group whose details you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the instance to which the consumer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to query the information about thread stack traces. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The information about thread stack traces is queried. You can obtain the information from the <strong>Jstack</strong> response parameter.</li>
         * </ul>
         * <blockquote>
         * <p>If you want to obtain the information about thread stack traces, make sure that the <strong>Detail</strong> parameter in the request is set to <strong>true</strong>.</p>
         * </blockquote>
         * <ul>
         * <li><strong>false</strong>: The information about thread stack traces is not queried. The value of the <strong>Jstack</strong> response parameter is empty. This value is the default value of the NeedJstack parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needJstack(Boolean needJstack) {
            this.putQueryParameter("NeedJstack", needJstack);
            this.needJstack = needJstack;
            return this;
        }

        @Override
        public OnsConsumerStatusRequest build() {
            return new OnsConsumerStatusRequest(this);
        } 

    } 

}
