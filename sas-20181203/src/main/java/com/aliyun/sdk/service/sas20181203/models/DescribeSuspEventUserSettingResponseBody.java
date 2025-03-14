// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventUserSettingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventUserSettingResponseBody</p>
 */
public class DescribeSuspEventUserSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LevelsOn")
    private java.util.List<String> levelsOn;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return levelsOn
     */
    public java.util.List<String> getLevelsOn() {
        return this.levelsOn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> levelsOn; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSuspEventUserSettingResponseBody model) {
            this.levelsOn = model.levelsOn;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the risk levels of alert notifications. Valid values:</p>
         * <ul>
         * <li><strong>remind</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>serious</strong></li>
         * </ul>
         */
        public Builder levelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>028CF634-5268-5660-9575-48C9ED6XXXXX</p>
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
