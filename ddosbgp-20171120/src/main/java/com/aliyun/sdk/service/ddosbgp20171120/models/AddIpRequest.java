// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpRequest} extends {@link RequestModel}
 *
 * <p>AddIpRequest</p>
 */
public class AddIpRequest extends Request {
    @Query
    @NameInMap("IpList")
    @Validation(required = true)
    private String ipList;

    @Query
    @NameInMap("PackId")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private AddIpRequest(Builder builder) {
        super(builder);
        this.ipList = builder.ipList;
        this.packId = builder.packId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<AddIpRequest, Builder> {
        private String ipList; 
        private String packId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(AddIpRequest request) {
            super(request);
            this.ipList = request.ipList;
            this.packId = request.packId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * PackId.
         */
        public Builder packId(String packId) {
            this.putQueryParameter("PackId", packId);
            this.packId = packId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public AddIpRequest build() {
            return new AddIpRequest(this);
        } 

    } 

}
