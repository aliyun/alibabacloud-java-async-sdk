// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AntChainPurposeResponseAli} extends {@link TeaModel}
 *
 * <p>AntChainPurposeResponseAli</p>
 */
public class AntChainPurposeResponseAli extends TeaModel {
    @NameInMap("RecordList")
    private java.util.List < ChainPurposeInfoAli > recordList;

    @NameInMap("Status")
    private String status;

    private AntChainPurposeResponseAli(Builder builder) {
        this.recordList = builder.recordList;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AntChainPurposeResponseAli create() {
        return builder().build();
    }

    /**
     * @return recordList
     */
    public java.util.List < ChainPurposeInfoAli > getRecordList() {
        return this.recordList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List < ChainPurposeInfoAli > recordList; 
        private String status; 

        /**
         * RecordList.
         */
        public Builder recordList(java.util.List < ChainPurposeInfoAli > recordList) {
            this.recordList = recordList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AntChainPurposeResponseAli build() {
            return new AntChainPurposeResponseAli(this);
        } 

    } 

}
