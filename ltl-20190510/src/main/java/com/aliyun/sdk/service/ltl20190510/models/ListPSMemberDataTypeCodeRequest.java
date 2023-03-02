// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPSMemberDataTypeCodeRequest} extends {@link RequestModel}
 *
 * <p>ListPSMemberDataTypeCodeRequest</p>
 */
public class ListPSMemberDataTypeCodeRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("Num")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListPSMemberDataTypeCodeRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.memberUid = builder.memberUid;
        this.num = builder.num;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPSMemberDataTypeCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListPSMemberDataTypeCodeRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String memberUid; 
        private Integer num; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListPSMemberDataTypeCodeRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.memberUid = request.memberUid;
            this.num = request.num;
            this.size = request.size;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * Num.
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListPSMemberDataTypeCodeRequest build() {
            return new ListPSMemberDataTypeCodeRequest(this);
        } 

    } 

}
