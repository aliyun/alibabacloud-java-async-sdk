// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIDEEventDetailRequest} extends {@link RequestModel}
 *
 * <p>GetIDEEventDetailRequest</p>
 */
public class GetIDEEventDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    private GetIDEEventDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.messageId = builder.messageId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIDEEventDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetIDEEventDetailRequest, Builder> {
        private String regionId; 
        private String messageId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetIDEEventDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.messageId = request.messageId;
            this.projectId = request.projectId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the message. You can obtain the ID from the received message when the extension point event is triggered.
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * The ID of the workspace. You can obtain the ID from the message.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetIDEEventDetailRequest build() {
            return new GetIDEEventDetailRequest(this);
        } 

    } 

}
