// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteBrowserOut} extends {@link TeaModel}
 *
 * <p>DeleteBrowserOut</p>
 */
public class DeleteBrowserOut extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserId")
    private String browserId;

    @com.aliyun.core.annotation.NameInMap("browserName")
    private String browserName;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteBrowserOut(Builder builder) {
        this.browserId = builder.browserId;
        this.browserName = builder.browserName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBrowserOut create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserId
     */
    public String getBrowserId() {
        return this.browserId;
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String browserId; 
        private String browserName; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteBrowserOut model) {
            this.browserId = model.browserId;
            this.browserName = model.browserName;
            this.status = model.status;
        } 

        /**
         * browserId.
         */
        public Builder browserId(String browserId) {
            this.browserId = browserId;
            return this;
        }

        /**
         * browserName.
         */
        public Builder browserName(String browserName) {
            this.browserName = browserName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteBrowserOut build() {
            return new DeleteBrowserOut(this);
        } 

    } 

}
