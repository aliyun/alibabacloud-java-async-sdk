// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link MosQueryRegistrationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>MosQueryRegistrationInfoResponseBody</p>
 */
public class MosQueryRegistrationInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MosQueryRegistrationInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MosQueryRegistrationInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MosQueryRegistrationInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public MosQueryRegistrationInfoResponseBody build() {
            return new MosQueryRegistrationInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MosQueryRegistrationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>MosQueryRegistrationInfoResponseBody</p>
     */
    public static class TagInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagCode")
        private String tagCode;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagInfos(Builder builder) {
            this.tagCode = builder.tagCode;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfos create() {
            return builder().build();
        }

        /**
         * @return tagCode
         */
        public String getTagCode() {
            return this.tagCode;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagCode; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagInfos model) {
                this.tagCode = model.tagCode;
                this.tagName = model.tagName;
            } 

            /**
             * TagCode.
             */
            public Builder tagCode(String tagCode) {
                this.tagCode = tagCode;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagInfos build() {
                return new TagInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link MosQueryRegistrationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>MosQueryRegistrationInfoResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("CheckinStatus")
        private String checkinStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("QrCode")
        private String qrCode;

        @com.aliyun.core.annotation.NameInMap("TagInfos")
        private java.util.List<TagInfos> tagInfos;

        @com.aliyun.core.annotation.NameInMap("UserCompany")
        private String userCompany;

        @com.aliyun.core.annotation.NameInMap("UserEmail")
        private String userEmail;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserPhone")
        private String userPhone;

        private List(Builder builder) {
            this.activityId = builder.activityId;
            this.channelName = builder.channelName;
            this.checkinStatus = builder.checkinStatus;
            this.id = builder.id;
            this.qrCode = builder.qrCode;
            this.tagInfos = builder.tagInfos;
            this.userCompany = builder.userCompany;
            this.userEmail = builder.userEmail;
            this.userName = builder.userName;
            this.userPhone = builder.userPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return checkinStatus
         */
        public String getCheckinStatus() {
            return this.checkinStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return qrCode
         */
        public String getQrCode() {
            return this.qrCode;
        }

        /**
         * @return tagInfos
         */
        public java.util.List<TagInfos> getTagInfos() {
            return this.tagInfos;
        }

        /**
         * @return userCompany
         */
        public String getUserCompany() {
            return this.userCompany;
        }

        /**
         * @return userEmail
         */
        public String getUserEmail() {
            return this.userEmail;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userPhone
         */
        public String getUserPhone() {
            return this.userPhone;
        }

        public static final class Builder {
            private String activityId; 
            private String channelName; 
            private String checkinStatus; 
            private Long id; 
            private String qrCode; 
            private java.util.List<TagInfos> tagInfos; 
            private String userCompany; 
            private String userEmail; 
            private String userName; 
            private String userPhone; 

            private Builder() {
            } 

            private Builder(List model) {
                this.activityId = model.activityId;
                this.channelName = model.channelName;
                this.checkinStatus = model.checkinStatus;
                this.id = model.id;
                this.qrCode = model.qrCode;
                this.tagInfos = model.tagInfos;
                this.userCompany = model.userCompany;
                this.userEmail = model.userEmail;
                this.userName = model.userName;
                this.userPhone = model.userPhone;
            } 

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * CheckinStatus.
             */
            public Builder checkinStatus(String checkinStatus) {
                this.checkinStatus = checkinStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * QrCode.
             */
            public Builder qrCode(String qrCode) {
                this.qrCode = qrCode;
                return this;
            }

            /**
             * TagInfos.
             */
            public Builder tagInfos(java.util.List<TagInfos> tagInfos) {
                this.tagInfos = tagInfos;
                return this;
            }

            /**
             * UserCompany.
             */
            public Builder userCompany(String userCompany) {
                this.userCompany = userCompany;
                return this;
            }

            /**
             * UserEmail.
             */
            public Builder userEmail(String userEmail) {
                this.userEmail = userEmail;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserPhone.
             */
            public Builder userPhone(String userPhone) {
                this.userPhone = userPhone;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link MosQueryRegistrationInfoResponseBody} extends {@link TeaModel}
     *
     * <p>MosQueryRegistrationInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.total = model.total;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
