// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateTeamResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTeamResponseBody</p>
 */
public class CreateTeamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("team")
    private E2BTeam team;

    private CreateTeamResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.team = builder.team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTeamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return team
     */
    public E2BTeam getTeam() {
        return this.team;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private E2BTeam team; 

        private Builder() {
        } 

        private Builder(CreateTeamResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.team = model.team;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * team.
         */
        public Builder team(E2BTeam team) {
            this.team = team;
            return this;
        }

        public CreateTeamResponseBody build() {
            return new CreateTeamResponseBody(this);
        } 

    } 

}
