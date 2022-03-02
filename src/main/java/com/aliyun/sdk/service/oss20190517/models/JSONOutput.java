// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link JSONOutput} extends {@link TeaModel}
 *
 * <p>JSONOutput</p>
 */
public class JSONOutput extends TeaModel {
    @NameInMap("RecordDelimiter")
    private String recordDelimiter;

    private JSONOutput(Builder builder) {
        this.recordDelimiter = builder.recordDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JSONOutput create() {
        return builder().build();
    }

    /**
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

    public static final class Builder {
        private String recordDelimiter; 

        /**
         * description
         */
        public Builder recordDelimiter(String recordDelimiter) {
            this.recordDelimiter = recordDelimiter;
            return this;
        }

        public JSONOutput build() {
            return new JSONOutput(this);
        } 

    } 

}
