// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AntChainPurposeResponse} extends {@link TeaModel}
 *
 * <p>AntChainPurposeResponse</p>
 */
public class AntChainPurposeResponse extends Response {
    @NameInMap("ChainPurposeExtend")
    private String chainPurposeExtend;

    @NameInMap("ChainPurposeItem")
    private String chainPurposeItem;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Purpose")
    private String purpose;

    @NameInMap("RecordList")
    private java.util.List < ChainPurpose > recordList;

    @NameInMap("Status")
    private String status;

    private AntChainPurposeResponse(BuilderImpl builder) {
        super(builder);
        this.chainPurposeExtend = builder.chainPurposeExtend;
        this.chainPurposeItem = builder.chainPurposeItem;
        this.createTime = builder.createTime;
        this.purpose = builder.purpose;
        this.recordList = builder.recordList;
        this.status = builder.status;
    }

    public static AntChainPurposeResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return chainPurposeExtend
     */
    public String getChainPurposeExtend() {
        return this.chainPurposeExtend;
    }

    /**
     * @return chainPurposeItem
     */
    public String getChainPurposeItem() {
        return this.chainPurposeItem;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return purpose
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @return recordList
     */
    public java.util.List < ChainPurpose > getRecordList() {
        return this.recordList;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public interface Builder extends Response.Builder<AntChainPurposeResponse, Builder> {

        Builder chainPurposeExtend(String chainPurposeExtend);

        Builder chainPurposeItem(String chainPurposeItem);

        Builder createTime(String createTime);

        Builder purpose(String purpose);

        Builder recordList(java.util.List < ChainPurpose > recordList);

        Builder status(String status);

        @Override
        AntChainPurposeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AntChainPurposeResponse, Builder>
            implements Builder {
        private String chainPurposeExtend; 
        private String chainPurposeItem; 
        private String createTime; 
        private String purpose; 
        private java.util.List < ChainPurpose > recordList; 
        private String status; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AntChainPurposeResponse response) {
            super(response);
            this.chainPurposeExtend = response.chainPurposeExtend;
            this.chainPurposeItem = response.chainPurposeItem;
            this.createTime = response.createTime;
            this.purpose = response.purpose;
            this.recordList = response.recordList;
            this.status = response.status;
        } 

        /**
         * ChainPurposeExtend.
         */
        @Override
        public Builder chainPurposeExtend(String chainPurposeExtend) {
            this.chainPurposeExtend = chainPurposeExtend;
            return this;
        }

        /**
         * ChainPurposeItem.
         */
        @Override
        public Builder chainPurposeItem(String chainPurposeItem) {
            this.chainPurposeItem = chainPurposeItem;
            return this;
        }

        /**
         * CreateTime.
         */
        @Override
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Purpose.
         */
        @Override
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            return this;
        }

        /**
         * RecordList.
         */
        @Override
        public Builder recordList(java.util.List < ChainPurpose > recordList) {
            this.recordList = recordList;
            return this;
        }

        /**
         * Status.
         */
        @Override
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        @Override
        public AntChainPurposeResponse build() {
            return new AntChainPurposeResponse(this);
        } 

    } 

}
