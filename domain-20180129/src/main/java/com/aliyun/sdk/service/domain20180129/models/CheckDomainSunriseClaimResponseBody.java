// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link CheckDomainSunriseClaimResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDomainSunriseClaimResponseBody</p>
 */
public class CheckDomainSunriseClaimResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClaimKey")
    private String claimKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Integer result;

    private CheckDomainSunriseClaimResponseBody(Builder builder) {
        this.claimKey = builder.claimKey;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDomainSunriseClaimResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return claimKey
     */
    public String getClaimKey() {
        return this.claimKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    public static final class Builder {
        private String claimKey; 
        private String requestId; 
        private Integer result; 

        private Builder() {
        } 

        private Builder(CheckDomainSunriseClaimResponseBody model) {
            this.claimKey = model.claimKey;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The trademark keyword key provided by the TMDB database.</p>
         * 
         * <strong>example:</strong>
         * <p>2017092100/8/2/1/kDfu9htHGEx_y-LJ3XSlKMZ70000020001</p>
         */
        public Builder claimKey(String claimKey) {
            this.claimKey = claimKey;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>BA7A4FD4-EB9A-4A20-BB0C-9AEB15634DC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not a trademark keyword or not in the claim domain lifecycle.</li>
         * <li><strong>1</strong>: In the sunrise domain lifecycle.</li>
         * <li><strong>2</strong>: In the claim domain lifecycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public CheckDomainSunriseClaimResponseBody build() {
            return new CheckDomainSunriseClaimResponseBody(this);
        } 

    } 

}
