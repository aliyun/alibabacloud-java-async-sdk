// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DraftMetaInfoErrorDetail} extends {@link TeaModel}
 *
 * <p>DraftMetaInfoErrorDetail</p>
 */
public class DraftMetaInfoErrorDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private DraftMetaInfoErrorDetail(Builder builder) {
        this.message = builder.message;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DraftMetaInfoErrorDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private String message; 
        private String reason; 

        private Builder() {
        } 

        private Builder(DraftMetaInfoErrorDetail model) {
            this.message = model.message;
            this.reason = model.reason;
        } 

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public DraftMetaInfoErrorDetail build() {
            return new DraftMetaInfoErrorDetail(this);
        } 

    } 

}
