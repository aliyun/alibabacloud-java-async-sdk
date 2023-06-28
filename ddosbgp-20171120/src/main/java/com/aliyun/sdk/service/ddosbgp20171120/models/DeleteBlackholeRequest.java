// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBlackholeRequest} extends {@link RequestModel}
 *
 * <p>DeleteBlackholeRequest</p>
 */
public class DeleteBlackholeRequest extends Request {
    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    @Query
    @NameInMap("PackId")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteBlackholeRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.packId = builder.packId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBlackholeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
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

    public static final class Builder extends Request.Builder<DeleteBlackholeRequest, Builder> {
        private String ip; 
        private String packId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBlackholeRequest request) {
            super(request);
            this.ip = request.ip;
            this.packId = request.packId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
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
        public DeleteBlackholeRequest build() {
            return new DeleteBlackholeRequest(this);
        } 

    } 

}
