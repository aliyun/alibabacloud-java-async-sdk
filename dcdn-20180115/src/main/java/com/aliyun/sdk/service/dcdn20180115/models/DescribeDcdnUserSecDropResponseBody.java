// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserSecDropResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserSecDropResponseBody</p>
 */
public class DescribeDcdnUserSecDropResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Drops")
    private Integer drops;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UuidStr")
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
         * The number of packets that are blocked.
         */
        public Builder drops(Integer drops) {
            this.drops = drops;
            return this;
        }

        /**
         * Indicates whether the information is found.
         * <p>
         * 
         * *   Found
         * *   Not Found
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The character string that is concatenated based on the request parameters and is used to locate causes when data is not found.
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
