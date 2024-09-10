// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommonOverallConfigListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommonOverallConfigListRequest</p>
 */
public class DescribeCommonOverallConfigListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeList")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The types of the configuration items.
         * <p>
         * 
         * >  You can query up to 50 types at a time.
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
