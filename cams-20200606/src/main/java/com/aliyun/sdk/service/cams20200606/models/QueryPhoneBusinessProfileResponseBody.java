// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPhoneBusinessProfileResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPhoneBusinessProfileResponseBody</p>
 */
public class QueryPhoneBusinessProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryPhoneBusinessProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPhoneBusinessProfileResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPhoneBusinessProfileResponseBody build() {
            return new QueryPhoneBusinessProfileResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Description")
        private String description;

        @NameInMap("Email")
        private String email;

        @NameInMap("ProfilePictureUrl")
        private String profilePictureUrl;

        @NameInMap("Vertical")
        private String vertical;

        @NameInMap("Websites")
        private java.util.List < String > websites;

        private Data(Builder builder) {
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
            private String address; 
            private String description; 
            private String email; 
            private String profilePictureUrl; 
            private String vertical; 
            private java.util.List < String > websites; 

            /**
             * The address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The email address.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The URL of the profile picture.
             */
            public Builder profilePictureUrl(String profilePictureUrl) {
                this.profilePictureUrl = profilePictureUrl;
                return this;
            }

            /**
             * The industry.
             */
            public Builder vertical(String vertical) {
                this.vertical = vertical;
                return this;
            }

            /**
             * The websites.
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
