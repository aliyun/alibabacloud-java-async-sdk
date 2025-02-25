// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSitePauseResponseBody} extends {@link TeaModel}
 *
 * <p>GetSitePauseResponseBody</p>
 */
public class GetSitePauseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Paused")
    private Boolean paused;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSitePauseResponseBody(Builder builder) {
        this.paused = builder.paused;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSitePauseResponseBody create() {
        return builder().build();
    }

    /**
     * @return paused
     */
    public Boolean getPaused() {
        return this.paused;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean paused; 
        private String requestId; 

        /**
         * <p>Indicates whether acceleration has been paused. Possible values:</p>
         * <ul>
         * <li>true: The site&quot;s acceleration is paused.</li>
         * <li>false: The site is accelerating normally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paused(Boolean paused) {
            this.paused = paused;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSitePauseResponseBody build() {
            return new GetSitePauseResponseBody(this);
        } 

    } 

}
