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
 * {@link DescribeLiveDomainMultiStreamConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainMultiStreamConfigResponseBody</p>
 */
public class DescribeLiveDomainMultiStreamConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Switch")
    private String _switch;

    private DescribeLiveDomainMultiStreamConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainMultiStreamConfigResponseBody create() {
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
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder {
        private String requestId; 
        private String _switch; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainMultiStreamConfigResponseBody model) {
            this.requestId = model.requestId;
            this._switch = model._switch;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F486A44F-6B35-5A96-BF2C-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the dual-stream disaster recovery feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder _switch(String _switch) {
            this._switch = _switch;
            return this;
        }

        public DescribeLiveDomainMultiStreamConfigResponseBody build() {
            return new DescribeLiveDomainMultiStreamConfigResponseBody(this);
        } 

    } 

}
