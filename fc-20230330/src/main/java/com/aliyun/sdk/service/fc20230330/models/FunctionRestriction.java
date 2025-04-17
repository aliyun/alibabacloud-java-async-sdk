// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link FunctionRestriction} extends {@link TeaModel}
 *
 * <p>FunctionRestriction</p>
 */
public class FunctionRestriction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disable")
    private Boolean disable;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private FunctionRestriction(Builder builder) {
        this.disable = builder.disable;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionRestriction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disable
     */
    public Boolean getDisable() {
        return this.disable;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private Boolean disable; 
        private String lastModifiedTime; 
        private String reason; 

        private Builder() {
        } 

        private Builder(FunctionRestriction model) {
            this.disable = model.disable;
            this.lastModifiedTime = model.lastModifiedTime;
            this.reason = model.reason;
        } 

        /**
         * disable.
         */
        public Builder disable(Boolean disable) {
            this.disable = disable;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public FunctionRestriction build() {
            return new FunctionRestriction(this);
        } 

    } 

}
