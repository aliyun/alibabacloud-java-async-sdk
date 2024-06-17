// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexRecoverRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexRecoverRecordsResponseBody</p>
 */
public class ListIndexRecoverRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("finishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("generationId")
    private String generationId;

    private ListIndexRecoverRecordsResponseBody(Builder builder) {
        this.desc = builder.desc;
        this.finishedTime = builder.finishedTime;
        this.generationId = builder.generationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexRecoverRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return finishedTime
     */
    public String getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return generationId
     */
    public String getGenerationId() {
        return this.generationId;
    }

    public static final class Builder {
        private String desc; 
        private String finishedTime; 
        private String generationId; 

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * finishedTime.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * generationId
         */
        public Builder generationId(String generationId) {
            this.generationId = generationId;
            return this;
        }

        public ListIndexRecoverRecordsResponseBody build() {
            return new ListIndexRecoverRecordsResponseBody(this);
        } 

    } 

}
