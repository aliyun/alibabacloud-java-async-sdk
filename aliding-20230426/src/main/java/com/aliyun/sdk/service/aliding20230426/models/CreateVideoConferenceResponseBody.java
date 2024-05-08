// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoConferenceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVideoConferenceResponseBody</p>
 */
public class CreateVideoConferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conferenceId")
    private String conferenceId;

    @com.aliyun.core.annotation.NameInMap("conferencePassword")
    private String conferencePassword;

    @com.aliyun.core.annotation.NameInMap("externalLinkUrl")
    private String externalLinkUrl;

    @com.aliyun.core.annotation.NameInMap("hostPassword")
    private String hostPassword;

    @com.aliyun.core.annotation.NameInMap("phoneNumbers")
    private java.util.List < String > phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("roomCode")
    private String roomCode;

    private CreateVideoConferenceResponseBody(Builder builder) {
        this.conferenceId = builder.conferenceId;
        this.conferencePassword = builder.conferencePassword;
        this.externalLinkUrl = builder.externalLinkUrl;
        this.hostPassword = builder.hostPassword;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.roomCode = builder.roomCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoConferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return conferencePassword
     */
    public String getConferencePassword() {
        return this.conferencePassword;
    }

    /**
     * @return externalLinkUrl
     */
    public String getExternalLinkUrl() {
        return this.externalLinkUrl;
    }

    /**
     * @return hostPassword
     */
    public String getHostPassword() {
        return this.hostPassword;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List < String > getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roomCode
     */
    public String getRoomCode() {
        return this.roomCode;
    }

    public static final class Builder {
        private String conferenceId; 
        private String conferencePassword; 
        private String externalLinkUrl; 
        private String hostPassword; 
        private java.util.List < String > phoneNumbers; 
        private String requestId; 
        private String roomCode; 

        /**
         * conferenceId.
         */
        public Builder conferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * conferencePassword.
         */
        public Builder conferencePassword(String conferencePassword) {
            this.conferencePassword = conferencePassword;
            return this;
        }

        /**
         * externalLinkUrl.
         */
        public Builder externalLinkUrl(String externalLinkUrl) {
            this.externalLinkUrl = externalLinkUrl;
            return this;
        }

        /**
         * hostPassword.
         */
        public Builder hostPassword(String hostPassword) {
            this.hostPassword = hostPassword;
            return this;
        }

        /**
         * phoneNumbers.
         */
        public Builder phoneNumbers(java.util.List < String > phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * roomCode.
         */
        public Builder roomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }

        public CreateVideoConferenceResponseBody build() {
            return new CreateVideoConferenceResponseBody(this);
        } 

    } 

}
