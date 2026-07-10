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
 * {@link UpdateTeamResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTeamResponseBody</p>
 */
public class UpdateTeamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("team")
    private E2BTeam team;

    private UpdateTeamResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.team = builder.team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTeamResponseBody create() {
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

        private Builder(UpdateTeamResponseBody model) {
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
         * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
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

        public UpdateTeamResponseBody build() {
            return new UpdateTeamResponseBody(this);
        } 

    } 

}
