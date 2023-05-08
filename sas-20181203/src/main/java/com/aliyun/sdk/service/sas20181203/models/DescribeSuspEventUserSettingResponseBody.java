// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventUserSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventUserSettingResponseBody</p>
 */
public class DescribeSuspEventUserSettingResponseBody extends TeaModel {
    @NameInMap("LevelsOn")
    private java.util.List < String > levelsOn;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSuspEventUserSettingResponseBody(Builder builder) {
        this.levelsOn = builder.levelsOn;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventUserSettingResponseBody create() {
        return builder().build();
    }

    /**
     * @return levelsOn
     */
    public java.util.List < String > getLevelsOn() {
        return this.levelsOn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > levelsOn; 
        private String requestId; 

        /**
         * An array that consists of the risk levels of alert notifications. Valid values:
         * <p>
         * 
         * *   **remind**
         * *   **suspicious**
         * *   **serious**
         */
        public Builder levelsOn(java.util.List < String > levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSuspEventUserSettingResponseBody build() {
            return new DescribeSuspEventUserSettingResponseBody(this);
        } 

    } 

}
