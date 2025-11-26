// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link CollationTimeZone} extends {@link TeaModel}
 *
 * <p>CollationTimeZone</p>
 */
public class CollationTimeZone extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentTimeOffset")
    private String currentTimeOffset;

    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private CollationTimeZone(Builder builder) {
        this.currentTimeOffset = builder.currentTimeOffset;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollationTimeZone create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentTimeOffset
     */
    public String getCurrentTimeOffset() {
        return this.currentTimeOffset;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String currentTimeOffset; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(CollationTimeZone model) {
            this.currentTimeOffset = model.currentTimeOffset;
            this.timeZone = model.timeZone;
        } 

        /**
         * CurrentTimeOffset.
         */
        public Builder currentTimeOffset(String currentTimeOffset) {
            this.currentTimeOffset = currentTimeOffset;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public CollationTimeZone build() {
            return new CollationTimeZone(this);
        } 

    } 

}
