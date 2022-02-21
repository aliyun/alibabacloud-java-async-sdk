// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @Body
    @NameInMap("Address")
    private String address;

    @Body
    @NameInMap("Age")
    @Validation(maximum = 100, minimum = 1)
    private Integer age;

    @Body
    @NameInMap("Attachment")
    private String attachment;

    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("FaceImageContent")
    private String faceImageContent;

    @Body
    @NameInMap("FaceImageUrl")
    private String faceImageUrl;

    @Body
    @NameInMap("Gender")
    @Validation(maximum = 2, minimum = 1)
    private Integer gender;

    @Body
    @NameInMap("IdNumber")
    private String idNumber;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("PhoneNo")
    private String phoneNo;

    @Body
    @NameInMap("PlateNo")
    private String plateNo;

    @Body
    @NameInMap("UserGroupId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long userGroupId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long userId;

    @Body
    @NameInMap("UserName")
    private String userName;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.age = builder.age;
        this.attachment = builder.attachment;
        this.bizId = builder.bizId;
        this.corpId = builder.corpId;
        this.faceImageContent = builder.faceImageContent;
        this.faceImageUrl = builder.faceImageUrl;
        this.gender = builder.gender;
        this.idNumber = builder.idNumber;
        this.isvSubId = builder.isvSubId;
        this.phoneNo = builder.phoneNo;
        this.plateNo = builder.plateNo;
        this.userGroupId = builder.userGroupId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @return attachment
     */
    public String getAttachment() {
        return this.attachment;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return faceImageContent
     */
    public String getFaceImageContent() {
        return this.faceImageContent;
    }

    /**
     * @return faceImageUrl
     */
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * @return idNumber
     */
    public String getIdNumber() {
        return this.idNumber;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return phoneNo
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }

    /**
     * @return plateNo
     */
    public String getPlateNo() {
        return this.plateNo;
    }

    /**
     * @return userGroupId
     */
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String address; 
        private Integer age; 
        private String attachment; 
        private String bizId; 
        private String corpId; 
        private String faceImageContent; 
        private String faceImageUrl; 
        private Integer gender; 
        private String idNumber; 
        private String isvSubId; 
        private String phoneNo; 
        private String plateNo; 
        private Long userGroupId; 
        private Long userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest response) {
            super(response);
            this.address = response.address;
            this.age = response.age;
            this.attachment = response.attachment;
            this.bizId = response.bizId;
            this.corpId = response.corpId;
            this.faceImageContent = response.faceImageContent;
            this.faceImageUrl = response.faceImageUrl;
            this.gender = response.gender;
            this.idNumber = response.idNumber;
            this.isvSubId = response.isvSubId;
            this.phoneNo = response.phoneNo;
            this.plateNo = response.plateNo;
            this.userGroupId = response.userGroupId;
            this.userId = response.userId;
            this.userName = response.userName;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putBodyParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Age.
         */
        public Builder age(Integer age) {
            this.putBodyParameter("Age", age);
            this.age = age;
            return this;
        }

        /**
         * Attachment.
         */
        public Builder attachment(String attachment) {
            this.putBodyParameter("Attachment", attachment);
            this.attachment = attachment;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * FaceImageContent.
         */
        public Builder faceImageContent(String faceImageContent) {
            this.putBodyParameter("FaceImageContent", faceImageContent);
            this.faceImageContent = faceImageContent;
            return this;
        }

        /**
         * FaceImageUrl.
         */
        public Builder faceImageUrl(String faceImageUrl) {
            this.putBodyParameter("FaceImageUrl", faceImageUrl);
            this.faceImageUrl = faceImageUrl;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(Integer gender) {
            this.putBodyParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * IdNumber.
         */
        public Builder idNumber(String idNumber) {
            this.putBodyParameter("IdNumber", idNumber);
            this.idNumber = idNumber;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * PhoneNo.
         */
        public Builder phoneNo(String phoneNo) {
            this.putBodyParameter("PhoneNo", phoneNo);
            this.phoneNo = phoneNo;
            return this;
        }

        /**
         * PlateNo.
         */
        public Builder plateNo(String plateNo) {
            this.putBodyParameter("PlateNo", plateNo);
            this.plateNo = plateNo;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(Long userGroupId) {
            this.putBodyParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
