// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateConsumerChannelRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerChannelRequest</p>
 */
public class CreateConsumerChannelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupUserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateConsumerChannelRequest(Builder builder) {
        super(builder);
        this.consumerGroupName = builder.consumerGroupName;
        this.consumerGroupPassword = builder.consumerGroupPassword;
        this.consumerGroupUserName = builder.consumerGroupUserName;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * @return consumerGroupPassword
     */
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    /**
     * @return consumerGroupUserName
     */
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateConsumerChannelRequest, Builder> {
        private String consumerGroupName; 
        private String consumerGroupPassword; 
        private String consumerGroupUserName; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerChannelRequest request) {
            super(request);
            this.consumerGroupName = request.consumerGroupName;
            this.consumerGroupPassword = request.consumerGroupPassword;
            this.consumerGroupUserName = request.consumerGroupUserName;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The name of the consumer group. The name can be up to 128 characters in length. We recommend that you use an informative name for easy identification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>订阅组A</p>
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * <p>The password of the consumer group.</p>
         * <ul>
         * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>A password must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder consumerGroupPassword(String consumerGroupPassword) {
            this.putQueryParameter("ConsumerGroupPassword", consumerGroupPassword);
            this.consumerGroupPassword = consumerGroupPassword;
            return this;
        }

        /**
         * <p>The username of the consumer group.</p>
         * <ul>
         * <li>A username must contain one or more of the following characters: uppercase letters, lowercase letters, digits, and underscores (_).</li>
         * <li>A username cannot exceed 16 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder consumerGroupUserName(String consumerGroupUserName) {
            this.putQueryParameter("ConsumerGroupUserName", consumerGroupUserName);
            this.consumerGroupUserName = consumerGroupUserName;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the instance ID.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong>. parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtsboss6pn1w******</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>DtsInstanceId</strong> and <strong>DtsJobId</strong>. parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>boss6pn1w******</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The ID of the region where the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2zx4uizich7y</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateConsumerChannelRequest build() {
            return new CreateConsumerChannelRequest(this);
        } 

    } 

}
