// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddProtectVpcListRequest} extends {@link RequestModel}
 *
 * <p>AddProtectVpcListRequest</p>
 */
public class AddProtectVpcListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddVpcInstanceIdList")
    private String addVpcInstanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelVpcInstanceIdList")
    private String delVpcInstanceIdList;

    private AddProtectVpcListRequest(Builder builder) {
        super(builder);
        this.addVpcInstanceIdList = builder.addVpcInstanceIdList;
        this.delVpcInstanceIdList = builder.delVpcInstanceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProtectVpcListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addVpcInstanceIdList
     */
    public String getAddVpcInstanceIdList() {
        return this.addVpcInstanceIdList;
    }

    /**
     * @return delVpcInstanceIdList
     */
    public String getDelVpcInstanceIdList() {
        return this.delVpcInstanceIdList;
    }

    public static final class Builder extends Request.Builder<AddProtectVpcListRequest, Builder> {
        private String addVpcInstanceIdList; 
        private String delVpcInstanceIdList; 

        private Builder() {
            super();
        } 

        private Builder(AddProtectVpcListRequest request) {
            super(request);
            this.addVpcInstanceIdList = request.addVpcInstanceIdList;
            this.delVpcInstanceIdList = request.delVpcInstanceIdList;
        } 

        /**
         * <p>Collection of new VPC instance IDs.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> interface to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vpc-bp1vnpgotyzay6p5i****&quot;,&quot;vpc-bp1vnpgotyzay6p5i****&quot;]</p>
         */
        public Builder addVpcInstanceIdList(String addVpcInstanceIdList) {
            this.putQueryParameter("AddVpcInstanceIdList", addVpcInstanceIdList);
            this.addVpcInstanceIdList = addVpcInstanceIdList;
            return this;
        }

        /**
         * <p>Collection of VPC instance IDs to be deleted.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> interface to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vpc-bp1vnpgotyzay6p5i****&quot;,&quot;vpc-bp1vnpgotyzay6p5i****&quot;]</p>
         */
        public Builder delVpcInstanceIdList(String delVpcInstanceIdList) {
            this.putQueryParameter("DelVpcInstanceIdList", delVpcInstanceIdList);
            this.delVpcInstanceIdList = delVpcInstanceIdList;
            return this;
        }

        @Override
        public AddProtectVpcListRequest build() {
            return new AddProtectVpcListRequest(this);
        } 

    } 

}
