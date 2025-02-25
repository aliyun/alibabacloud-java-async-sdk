// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetShareLinkTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetShareLinkTokenResponseBody</p>
 */
public class GetShareLinkTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expires_in")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("share_token")
    private String shareToken;

    private GetShareLinkTokenResponseBody(Builder builder) {
        this.expiresIn = builder.expiresIn;
        this.shareToken = builder.shareToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShareLinkTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return shareToken
     */
    public String getShareToken() {
        return this.shareToken;
    }

    public static final class Builder {
        private Long expiresIn; 
        private String shareToken; 

        /**
         * <p>The validity period of the token. Unit: seconds. For example, a value of 7200 indicates two hours.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>The JSON Web Token (JWT).</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiJjOWI3YTVhYTA0ZDE0YWUzODY3ZmRjODg2ZmEwMWRhNCIsImN1c3RvbUpzb24iOiJ7XCJjbGllbnRJZFwiOlwiMjVkelgzdmJZcWt0Vnh5WFwiLFwiZG9tYWluSWRcIjpcImJqMjlcIixcInNjb3BlXCI6W1wiRFJJVkUuQUxMXCIsXCJTSEFSRS5BTExcIixcIkZJTEUuQUxMXCIsXCJVU0VSLkFMTFwiLFwiVklFVy5BTExcIixcIlNUT1JBR0UuQUxMXCIsXCJTVE9SQUdFRklMRS5MSVNUXCIsXCJCQVRDSFwiLFwiT0FVVEguQUxMXCIsXCJJTUFHRS5BTExcIixcIklOVklURS5BTExcIixcIkFDQ09VTlQuQUxMXCJdLFwicm9sZVwiOlwidXNlclwiLFwicmVmXCI6XCJodHRwczovL3d3dy5hbGl5dW5kcml2ZS5jb20vXCIsXCJkZXZpY2VfaWRcIjpcImIyODIwNWU1YzU5NzRjY2JiODI3MDNiNjhkYjhjNDUxXCJ9IiwiZXhwIjoxNjQ4NjE0NDkzLCJpYXQiOjE2NDg2MDcyMzN9.d3HVLvv_LFw2QhPrhvjH_kICWQJX9sKKt7NjQEqI_xE2JO_b7D8rPsFTZz93PLvZ7MhCmudTjGImUpd-ehFnI4Go-1S7BGaKaHFILvP-sWy18Wpikowjxx9mSbzBM_cO6D1LI-kyYhXKWHgVdADfVIPniTDA7-ffhUpi7cAebEs</p>
         */
        public Builder shareToken(String shareToken) {
            this.shareToken = shareToken;
            return this;
        }

        public GetShareLinkTokenResponseBody build() {
            return new GetShareLinkTokenResponseBody(this);
        } 

    } 

}
