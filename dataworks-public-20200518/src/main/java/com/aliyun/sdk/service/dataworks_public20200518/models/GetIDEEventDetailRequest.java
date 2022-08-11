// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIDEEventDetailRequest} extends {@link RequestModel}
 *
 * <p>GetIDEEventDetailRequest</p>
 */
public class GetIDEEventDetailRequest extends Request {
    @Body
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetIDEEventDetailRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetIDEEventDetailRequest, Builder> {
        private String messageId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetIDEEventDetailRequest request) {
            super(request);
            this.messageId = request.messageId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetIDEEventDetailRequest build() {
            return new GetIDEEventDetailRequest(this);
        } 

    } 

}
