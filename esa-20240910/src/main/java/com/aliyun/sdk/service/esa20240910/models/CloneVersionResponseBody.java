// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CloneVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CloneVersionResponseBody</p>
 */
public class CloneVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloneVersion")
    private Integer cloneVersion;

    @com.aliyun.core.annotation.NameInMap("OriginVersion")
    private Integer originVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneVersionResponseBody(Builder builder) {
        this.cloneVersion = builder.cloneVersion;
        this.originVersion = builder.originVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloneVersion
     */
    public Integer getCloneVersion() {
        return this.cloneVersion;
    }

    /**
     * @return originVersion
     */
    public Integer getOriginVersion() {
        return this.originVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer cloneVersion; 
        private Integer originVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloneVersionResponseBody model) {
            this.cloneVersion = model.cloneVersion;
            this.originVersion = model.originVersion;
            this.requestId = model.requestId;
        } 

        /**
         * CloneVersion.
         */
        public Builder cloneVersion(Integer cloneVersion) {
            this.cloneVersion = cloneVersion;
            return this;
        }

        /**
         * OriginVersion.
         */
        public Builder originVersion(Integer originVersion) {
            this.originVersion = originVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneVersionResponseBody build() {
            return new CloneVersionResponseBody(this);
        } 

    } 

}
