// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link ApplyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyTokenResponseBody</p>
 */
public class ApplyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private ApplyTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String requestId; 
        private String token; 

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>31782AAF-D0CC-44C3-ABFD-1B500276****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The token that is returned by the ApsaraMQ for MQTT broker.</p>
         * <blockquote>
         * <p> Do not assume the length, format, or rule of the token to return. The actual returned token shall prevail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LzMT+XLFl5s/YWJ/MlDz4t/Lq5HC1iGU1P28HAMaxYxn8aQbALNtml7QZKl9L9kPe6LqUb95tEVo+zUqOogs9+jZwDUSzsd4X4qaD3n2TrBEuMOqKkk1Xdrvu9VBQQvIYbz7MJWZDYC3DlW7gLEr33Cuj54iIhagtBi3epStJitsssWs7otY9zhKOSZxhr49G3d0bh35mwyP18EMvDas8UlzeSozsSrujNUqZXOGK0PEBSd+rWMGDJlCt6GFmJgm2JFY7PJwf/7OOSmUYIYFs5o/PuPpoTMF+hcVXMs+0yDukIMTOzG9m3t8k36PVrghFmnK6pC3Rt3mibjW****ng==</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ApplyTokenResponseBody build() {
            return new ApplyTokenResponseBody(this);
        } 

    } 

}
