// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LabelPartnerUserResponseBody} extends {@link TeaModel}
 *
 * <p>LabelPartnerUserResponseBody</p>
 */
public class LabelPartnerUserResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private LabelPartnerUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelPartnerUserResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public LabelPartnerUserResponseBody build() {
            return new LabelPartnerUserResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("UserPK")
        private Long userPK;

        @NameInMap("UserTag")
        private String userTag;

        private Data(Builder builder) {
            this.userPK = builder.userPK;
            this.userTag = builder.userTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return userPK
         */
        public Long getUserPK() {
            return this.userPK;
        }

        /**
         * @return userTag
         */
        public String getUserTag() {
            return this.userTag;
        }

        public static final class Builder {
            private Long userPK; 
            private String userTag; 

            /**
             * UserPK.
             */
            public Builder userPK(Long userPK) {
                this.userPK = userPK;
                return this;
            }

            /**
             * UserTag.
             */
            public Builder userTag(String userTag) {
                this.userTag = userTag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
