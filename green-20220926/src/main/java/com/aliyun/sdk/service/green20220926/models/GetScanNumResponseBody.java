// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetScanNumResponseBody} extends {@link TeaModel}
 *
 * <p>GetScanNumResponseBody</p>
 */
public class GetScanNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LimitNumber")
    private Long limitNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanNumber")
    private Long scanNumber;

    @com.aliyun.core.annotation.NameInMap("SumNumber")
    private Long sumNumber;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private Boolean tag;

    private GetScanNumResponseBody(Builder builder) {
        this.limitNumber = builder.limitNumber;
        this.requestId = builder.requestId;
        this.scanNumber = builder.scanNumber;
        this.sumNumber = builder.sumNumber;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScanNumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limitNumber
     */
    public Long getLimitNumber() {
        return this.limitNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanNumber
     */
    public Long getScanNumber() {
        return this.scanNumber;
    }

    /**
     * @return sumNumber
     */
    public Long getSumNumber() {
        return this.sumNumber;
    }

    /**
     * @return tag
     */
    public Boolean getTag() {
        return this.tag;
    }

    public static final class Builder {
        private Long limitNumber; 
        private String requestId; 
        private Long scanNumber; 
        private Long sumNumber; 
        private Boolean tag; 

        private Builder() {
        } 

        private Builder(GetScanNumResponseBody model) {
            this.limitNumber = model.limitNumber;
            this.requestId = model.requestId;
            this.scanNumber = model.scanNumber;
            this.sumNumber = model.sumNumber;
            this.tag = model.tag;
        } 

        /**
         * <p>The upper limit on the number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limitNumber(Long limitNumber) {
            this.limitNumber = limitNumber;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of files pending detection.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder scanNumber(Long scanNumber) {
            this.scanNumber = scanNumber;
            return this;
        }

        /**
         * <p>The total number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sumNumber(Long sumNumber) {
            this.sumNumber = sumNumber;
            return this;
        }

        /**
         * <p>Indicates whether the user is a whitelisted user.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder tag(Boolean tag) {
            this.tag = tag;
            return this;
        }

        public GetScanNumResponseBody build() {
            return new GetScanNumResponseBody(this);
        } 

    } 

}
