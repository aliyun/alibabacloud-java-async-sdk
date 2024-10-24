// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OperateAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>OperateAvatarProjectRequest</p>
 */
public class OperateAvatarProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operateType")
    private String operateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resChannelNumber")
    private Integer resChannelNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resType")
    private String resType;

    private OperateAvatarProjectRequest(Builder builder) {
        super(builder);
        this.operateType = builder.operateType;
        this.projectId = builder.projectId;
        this.resChannelNumber = builder.resChannelNumber;
        this.resType = builder.resType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAvatarProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return resChannelNumber
     */
    public Integer getResChannelNumber() {
        return this.resChannelNumber;
    }

    /**
     * @return resType
     */
    public String getResType() {
        return this.resType;
    }

    public static final class Builder extends Request.Builder<OperateAvatarProjectRequest, Builder> {
        private String operateType; 
        private String projectId; 
        private Integer resChannelNumber; 
        private String resType; 

        private Builder() {
            super();
        } 

        private Builder(OperateAvatarProjectRequest request) {
            super(request);
            this.operateType = request.operateType;
            this.projectId = request.projectId;
            this.resChannelNumber = request.resChannelNumber;
            this.resType = request.resType;
        } 

        /**
         * operateType.
         */
        public Builder operateType(String operateType) {
            this.putBodyParameter("operateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * resChannelNumber.
         */
        public Builder resChannelNumber(Integer resChannelNumber) {
            this.putBodyParameter("resChannelNumber", resChannelNumber);
            this.resChannelNumber = resChannelNumber;
            return this;
        }

        /**
         * resType.
         */
        public Builder resType(String resType) {
            this.putBodyParameter("resType", resType);
            this.resType = resType;
            return this;
        }

        @Override
        public OperateAvatarProjectRequest build() {
            return new OperateAvatarProjectRequest(this);
        } 

    } 

}
