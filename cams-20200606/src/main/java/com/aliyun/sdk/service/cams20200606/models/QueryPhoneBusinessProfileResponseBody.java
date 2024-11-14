// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPhoneBusinessProfileResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPhoneBusinessProfileResponseBody</p>
 */
public class QueryPhoneBusinessProfileResponseBody extends TeaModel {
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

    private QueryPhoneBusinessProfileResponseBody(Builder builder) {
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

    public static QueryPhoneBusinessProfileResponseBody create() {
        return builder().build();
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

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * <ul>
         * <li>A value of OK indicates that the call is successful.</li>
         * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPhoneBusinessProfileResponseBody build() {
            return new QueryPhoneBusinessProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPhoneBusinessProfileResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPhoneBusinessProfileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("About")
        private String about;

        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("ProfilePictureUrl")
        private String profilePictureUrl;

        @com.aliyun.core.annotation.NameInMap("Vertical")
        private String vertical;

        @com.aliyun.core.annotation.NameInMap("Websites")
        private java.util.List < String > websites;

        private Data(Builder builder) {
            this.about = builder.about;
            this.address = builder.address;
            this.description = builder.description;
            this.email = builder.email;
            this.profilePictureUrl = builder.profilePictureUrl;
            this.vertical = builder.vertical;
            this.websites = builder.websites;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return about
         */
        public String getAbout() {
            return this.about;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return profilePictureUrl
         */
        public String getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        /**
         * @return vertical
         */
        public String getVertical() {
            return this.vertical;
        }

        /**
         * @return websites
         */
        public java.util.List < String > getWebsites() {
            return this.websites;
        }

        public static final class Builder {
            private String about; 
            private String address; 
            private String description; 
            private String email; 
            private String profilePictureUrl; 
            private String vertical; 
            private java.util.List < String > websites; 

            /**
             * <p>Regarding.</p>
             * 
             * <strong>example:</strong>
             * <p>business profile</p>
             */
            public Builder about(String about) {
                this.about = about;
                return this;
            }

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>Changsha</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:aa@aliyun.com">aa@aliyun.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The profile picture.</p>
             * 
             * <strong>example:</strong>
             * <p>https://....img</p>
             */
            public Builder profilePictureUrl(String profilePictureUrl) {
                this.profilePictureUrl = profilePictureUrl;
                return this;
            }

            /**
             * <p>The industry.</p>
             * 
             * <strong>example:</strong>
             * <p>Retail</p>
             */
            public Builder vertical(String vertical) {
                this.vertical = vertical;
                return this;
            }

            /**
             * <p>The website.</p>
             */
            public Builder websites(java.util.List < String > websites) {
                this.websites = websites;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
