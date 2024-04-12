// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TravelStandardListQueryRequest} extends {@link RequestModel}
 *
 * <p>TravelStandardListQueryRequest</p>
 */
public class TravelStandardListQueryRequest extends Request {
    @Query
    @NameInMap("from_group")
    private Boolean fromGroup;

    @Query
    @NameInMap("page_no")
    @Validation(required = true, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("page_size")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("rule_name")
    private String ruleName;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    @Validation(required = true)
    private String xAcsBtripCorpToken;

    private TravelStandardListQueryRequest(Builder builder) {
        super(builder);
        this.fromGroup = builder.fromGroup;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TravelStandardListQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromGroup
     */
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TravelStandardListQueryRequest, Builder> {
        private Boolean fromGroup; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String ruleName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TravelStandardListQueryRequest request) {
            super(request);
            this.fromGroup = request.fromGroup;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * from_group.
         */
        public Builder fromGroup(Boolean fromGroup) {
            this.putQueryParameter("from_group", fromGroup);
            this.fromGroup = fromGroup;
            return this;
        }

        /**
         * page_no.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * rule_name.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("rule_name", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TravelStandardListQueryRequest build() {
            return new TravelStandardListQueryRequest(this);
        } 

    } 

}
