// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescAccountSummary2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescAccountSummary2ResponseBody</p>
 */
public class DescAccountSummary2ResponseBody extends TeaModel {
    @NameInMap("MnsBag")
    private Integer mnsBag;

    @NameInMap("MnsForceMigrating")
    private Integer mnsForceMigrating;

    @NameInMap("MnsMigrating")
    private Integer mnsMigrating;

    @NameInMap("RequestId")
    private String requestId;

    private DescAccountSummary2ResponseBody(Builder builder) {
        this.mnsBag = builder.mnsBag;
        this.mnsForceMigrating = builder.mnsForceMigrating;
        this.mnsMigrating = builder.mnsMigrating;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescAccountSummary2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return mnsBag
     */
    public Integer getMnsBag() {
        return this.mnsBag;
    }

    /**
     * @return mnsForceMigrating
     */
    public Integer getMnsForceMigrating() {
        return this.mnsForceMigrating;
    }

    /**
     * @return mnsMigrating
     */
    public Integer getMnsMigrating() {
        return this.mnsMigrating;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer mnsBag; 
        private Integer mnsForceMigrating; 
        private Integer mnsMigrating; 
        private String requestId; 

        /**
         * MnsBag.
         */
        public Builder mnsBag(Integer mnsBag) {
            this.mnsBag = mnsBag;
            return this;
        }

        /**
         * MnsForceMigrating.
         */
        public Builder mnsForceMigrating(Integer mnsForceMigrating) {
            this.mnsForceMigrating = mnsForceMigrating;
            return this;
        }

        /**
         * MnsMigrating.
         */
        public Builder mnsMigrating(Integer mnsMigrating) {
            this.mnsMigrating = mnsMigrating;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescAccountSummary2ResponseBody build() {
            return new DescAccountSummary2ResponseBody(this);
        } 

    } 

}
