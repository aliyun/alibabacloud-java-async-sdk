// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClassRequest} extends {@link RequestModel}
 *
 * <p>CreateClassRequest</p>
 */
public class CreateClassRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CreateNickname")
    @Validation(required = true)
    private String createNickname;

    @Body
    @NameInMap("CreateUserId")
    @Validation(required = true)
    private String createUserId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private CreateClassRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.createNickname = builder.createNickname;
        this.createUserId = builder.createUserId;
        this.regionId = builder.regionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClassRequest create() {
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
     * @return createNickname
     */
    public String getCreateNickname() {
        return this.createNickname;
    }

    /**
     * @return createUserId
     */
    public String getCreateUserId() {
        return this.createUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateClassRequest, Builder> {
        private String appId; 
        private String createNickname; 
        private String createUserId; 
        private String regionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateClassRequest request) {
            super(request);
            this.appId = request.appId;
            this.createNickname = request.createNickname;
            this.createUserId = request.createUserId;
            this.regionId = request.regionId;
            this.title = request.title;
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
         * 创建人用户昵称。
         */
        public Builder createNickname(String createNickname) {
            this.putBodyParameter("CreateNickname", createNickname);
            this.createNickname = createNickname;
            return this;
        }

        /**
         * 创建人用户ID。
         */
        public Builder createUserId(String createUserId) {
            this.putBodyParameter("CreateUserId", createUserId);
            this.createUserId = createUserId;
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
         * 课堂标题
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateClassRequest build() {
            return new CreateClassRequest(this);
        } 

    } 

}
