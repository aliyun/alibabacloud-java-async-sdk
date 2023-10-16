// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("Concurrency")
    @Validation(required = true)
    private Long concurrency;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NluServiceParamsJson")
    private String nluServiceParamsJson;

    @Query
    @NameInMap("UnionInstanceId")
    private String unionInstanceId;

    @Query
    @NameInMap("UnionSource")
    private String unionSource;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.description = builder.description;
        this.name = builder.name;
        this.nluServiceParamsJson = builder.nluServiceParamsJson;
        this.unionInstanceId = builder.unionInstanceId;
        this.unionSource = builder.unionSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nluServiceParamsJson
     */
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    /**
     * @return unionInstanceId
     */
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    /**
     * @return unionSource
     */
    public String getUnionSource() {
        return this.unionSource;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private Long concurrency; 
        private String description; 
        private String name; 
        private String nluServiceParamsJson; 
        private String unionInstanceId; 
        private String unionSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.description = request.description;
            this.name = request.name;
            this.nluServiceParamsJson = request.nluServiceParamsJson;
            this.unionInstanceId = request.unionInstanceId;
            this.unionSource = request.unionSource;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.putQueryParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NluServiceParamsJson.
         */
        public Builder nluServiceParamsJson(String nluServiceParamsJson) {
            this.putQueryParameter("NluServiceParamsJson", nluServiceParamsJson);
            this.nluServiceParamsJson = nluServiceParamsJson;
            return this;
        }

        /**
         * UnionInstanceId.
         */
        public Builder unionInstanceId(String unionInstanceId) {
            this.putQueryParameter("UnionInstanceId", unionInstanceId);
            this.unionInstanceId = unionInstanceId;
            return this;
        }

        /**
         * UnionSource.
         */
        public Builder unionSource(String unionSource) {
            this.putQueryParameter("UnionSource", unionSource);
            this.unionSource = unionSource;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
