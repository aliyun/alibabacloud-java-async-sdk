// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserSecDropResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserSecDropResponseBody</p>
 */
public class DescribeDcdnUserSecDropResponseBody extends TeaModel {
    @NameInMap("Drops")
    private Integer drops;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UuidStr")
    private String uuidStr;

    private DescribeDcdnUserSecDropResponseBody(Builder builder) {
        this.drops = builder.drops;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.uuidStr = builder.uuidStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserSecDropResponseBody create() {
        return builder().build();
    }

    /**
     * @return drops
     */
    public Integer getDrops() {
        return this.drops;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uuidStr
     */
    public String getUuidStr() {
        return this.uuidStr;
    }

    public static final class Builder {
        private Integer drops; 
        private String msg; 
        private String requestId; 
        private String uuidStr; 

        /**
         * Drops.
         */
        public Builder drops(Integer drops) {
            this.drops = drops;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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
         * UuidStr.
         */
        public Builder uuidStr(String uuidStr) {
            this.uuidStr = uuidStr;
            return this;
        }

        public DescribeDcdnUserSecDropResponseBody build() {
            return new DescribeDcdnUserSecDropResponseBody(this);
        } 

    } 

}
