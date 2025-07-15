// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link PlayChoosenShowResponseBody} extends {@link TeaModel}
 *
 * <p>PlayChoosenShowResponseBody</p>
 */
public class PlayChoosenShowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowId")
    private String showId;

    private PlayChoosenShowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.showId = builder.showId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayChoosenShowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    public static final class Builder {
        private String requestId; 
        private String showId; 

        private Builder() {
        } 

        private Builder(PlayChoosenShowResponseBody model) {
            this.requestId = model.requestId;
            this.showId = model.showId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder showId(String showId) {
            this.showId = showId;
            return this;
        }

        public PlayChoosenShowResponseBody build() {
            return new PlayChoosenShowResponseBody(this);
        } 

    } 

}
