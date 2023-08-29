// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBootResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBootResponseBody</p>
 */
public class DescribeBootResponseBody extends TeaModel {
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Id")
    private Long id;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WhiteListAffiliation")
    private Integer whiteListAffiliation;

    @NameInMap("WhiteListDetail")
    private String whiteListDetail;

    private DescribeBootResponseBody(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.whiteListAffiliation = builder.whiteListAffiliation;
        this.whiteListDetail = builder.whiteListDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBootResponseBody create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whiteListAffiliation
     */
    public Integer getWhiteListAffiliation() {
        return this.whiteListAffiliation;
    }

    /**
     * @return whiteListDetail
     */
    public String getWhiteListDetail() {
        return this.whiteListDetail;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String requestId; 
        private Integer whiteListAffiliation; 
        private String whiteListDetail; 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * WhiteListAffiliation.
         */
        public Builder whiteListAffiliation(Integer whiteListAffiliation) {
            this.whiteListAffiliation = whiteListAffiliation;
            return this;
        }

        /**
         * WhiteListDetail.
         */
        public Builder whiteListDetail(String whiteListDetail) {
            this.whiteListDetail = whiteListDetail;
            return this;
        }

        public DescribeBootResponseBody build() {
            return new DescribeBootResponseBody(this);
        } 

    } 

}
