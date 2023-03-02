// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiPartyCollaborationChainRequest} extends {@link RequestModel}
 *
 * <p>ListMultiPartyCollaborationChainRequest</p>
 */
public class ListMultiPartyCollaborationChainRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Num")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListMultiPartyCollaborationChainRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.name = builder.name;
        this.num = builder.num;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiPartyCollaborationChainRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<ListMultiPartyCollaborationChainRequest, Builder> {
        private String apiVersion; 
        private String name; 
        private Integer num; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListMultiPartyCollaborationChainRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public ListMultiPartyCollaborationChainRequest build() {
            return new ListMultiPartyCollaborationChainRequest(this);
        } 

    } 

}
