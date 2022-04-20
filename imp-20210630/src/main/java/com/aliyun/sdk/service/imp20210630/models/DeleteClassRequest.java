// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClassRequest} extends {@link RequestModel}
 *
 * <p>DeleteClassRequest</p>
 */
public class DeleteClassRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("ClassId")
    @Validation(required = true)
    private String classId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserId")
    private String userId;

    private DeleteClassRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.classId = builder.classId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClassRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return classId
     */
    public String getClassId() {
        return this.classId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteClassRequest, Builder> {
        private String appId; 
        private String classId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClassRequest request) {
            super(request);
            this.appId = request.appId;
            this.classId = request.classId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 课堂唯一标识。
         */
        public Builder classId(String classId) {
            this.putBodyParameter("ClassId", classId);
            this.classId = classId;
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

        /**
         * 操作人用户ID，仅支持中英文数字，下划线，中划线，1~36个字符。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteClassRequest build() {
            return new DeleteClassRequest(this);
        } 

    } 

}
