// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link StopCrawlerResponseBody} extends {@link TeaModel}
 *
 * <p>StopCrawlerResponseBody</p>
 */
public class StopCrawlerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StopAccepted")
    private Boolean stopAccepted;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StopCrawlerResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.stopAccepted = builder.stopAccepted;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCrawlerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stopAccepted
     */
    public Boolean getStopAccepted() {
        return this.stopAccepted;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 
        private Boolean stopAccepted; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StopCrawlerResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.stopAccepted = model.stopAccepted;
            this.success = model.success;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StopAccepted.
         */
        public Builder stopAccepted(Boolean stopAccepted) {
            this.stopAccepted = stopAccepted;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StopCrawlerResponseBody build() {
            return new StopCrawlerResponseBody(this);
        } 

    } 

}
