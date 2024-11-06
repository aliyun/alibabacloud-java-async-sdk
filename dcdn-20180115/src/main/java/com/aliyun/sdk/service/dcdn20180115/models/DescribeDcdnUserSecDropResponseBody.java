// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The number of packets that are blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>233023208</p>
         */
        public Builder drops(Integer drops) {
            this.drops = drops;
            return this;
        }

        /**
         * <p>Indicates whether the information is found.</p>
         * <ul>
         * <li>Found</li>
         * <li>Not Found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Found</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4A1295C0-7A5C-4F27-8D70-C3A648E7037F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The character string that is concatenated based on the request parameters and is used to locate causes when data is not found.</p>
         * 
         * <strong>example:</strong>
         * <p>1day10811******6429wafDCDN</p>
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
