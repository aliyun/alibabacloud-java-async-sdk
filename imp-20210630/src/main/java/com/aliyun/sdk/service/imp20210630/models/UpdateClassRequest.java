// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClassRequest} extends {@link RequestModel}
 *
 * <p>UpdateClassRequest</p>
 */
public class UpdateClassRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("ClassId")
    @Validation(required = true)
    private String classId;

    @Body
    @NameInMap("CreateNickname")
    private String createNickname;

    @Body
    @NameInMap("CreateUserId")
    private String createUserId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Title")
    private String title;

    private UpdateClassRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.classId = builder.classId;
        this.createNickname = builder.createNickname;
        this.createUserId = builder.createUserId;
        this.regionId = builder.regionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClassRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateClassRequest, Builder> {
        private String appId; 
        private String classId; 
        private String createNickname; 
        private String createUserId; 
        private String regionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClassRequest request) {
            super(request);
            this.appId = request.appId;
            this.classId = request.classId;
            this.createNickname = request.createNickname;
            this.createUserId = request.createUserId;
            this.regionId = request.regionId;
            this.title = request.title;
        } 

        /**
         * ????????????????????????6?????????????????????????????????
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder classId(String classId) {
            this.putBodyParameter("ClassId", classId);
            this.classId = classId;
            return this;
        }

        /**
         * ????????????????????????1~32????????????
         */
        public Builder createNickname(String createNickname) {
            this.putBodyParameter("CreateNickname", createNickname);
            this.createNickname = createNickname;
            return this;
        }

        /**
         * ???????????????ID??????????????????????????????????????????????????????1~36????????????
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
         * ???????????????1~32????????????
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateClassRequest build() {
            return new UpdateClassRequest(this);
        } 

    } 

}
