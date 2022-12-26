// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommonOverallConfigListRequest</p>
 */
public class DescribeCommonOverallConfigListRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TypeList")
    @Validation(required = true)
    private java.util.List < String > typeList;

    private DescribeCommonOverallConfigListRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonOverallConfigListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return typeList
     */
    public java.util.List < String > getTypeList() {
        return this.typeList;
    }

    public static final class Builder extends Request.Builder<DescribeCommonOverallConfigListRequest, Builder> {
        private String sourceIp; 
        private java.util.List < String > typeList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommonOverallConfigListRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.typeList = request.typeList;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(java.util.List < String > typeList) {
            this.putQueryParameter("TypeList", typeList);
            this.typeList = typeList;
            return this;
        }

        @Override
        public DescribeCommonOverallConfigListRequest build() {
            return new DescribeCommonOverallConfigListRequest(this);
        } 

    } 

}
