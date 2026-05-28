// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ScanFileOutput} extends {@link TeaModel}
 *
 * <p>ScanFileOutput</p>
 */
public class ScanFileOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scanFileInfoList")
    private java.util.List<ScanFileInfo> scanFileInfoList;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private UnifiedSearchInformation searchInformation;

    private ScanFileOutput(Builder builder) {
        this.requestId = builder.requestId;
        this.scanFileInfoList = builder.scanFileInfoList;
        this.searchInformation = builder.searchInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileOutput create() {
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
     * @return scanFileInfoList
     */
    public java.util.List<ScanFileInfo> getScanFileInfoList() {
        return this.scanFileInfoList;
    }

    /**
     * @return searchInformation
     */
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ScanFileInfo> scanFileInfoList; 
        private UnifiedSearchInformation searchInformation; 

        private Builder() {
        } 

        private Builder(ScanFileOutput model) {
            this.requestId = model.requestId;
            this.scanFileInfoList = model.scanFileInfoList;
            this.searchInformation = model.searchInformation;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scanFileInfoList.
         */
        public Builder scanFileInfoList(java.util.List<ScanFileInfo> scanFileInfoList) {
            this.scanFileInfoList = scanFileInfoList;
            return this;
        }

        /**
         * searchInformation.
         */
        public Builder searchInformation(UnifiedSearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        public ScanFileOutput build() {
            return new ScanFileOutput(this);
        } 

    } 

}
