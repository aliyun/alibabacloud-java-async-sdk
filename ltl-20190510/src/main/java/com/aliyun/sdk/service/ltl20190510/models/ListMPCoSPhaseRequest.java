// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMPCoSPhaseRequest} extends {@link RequestModel}
 *
 * <p>ListMPCoSPhaseRequest</p>
 */
public class ListMPCoSPhaseRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Num")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @Query
    @NameInMap("PhaseGroupId")
    @Validation(required = true)
    private String phaseGroupId;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListMPCoSPhaseRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.name = builder.name;
        this.num = builder.num;
        this.phaseGroupId = builder.phaseGroupId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMPCoSPhaseRequest create() {
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
     * @return phaseGroupId
     */
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListMPCoSPhaseRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String name; 
        private Integer num; 
        private String phaseGroupId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListMPCoSPhaseRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.name = request.name;
            this.num = request.num;
            this.phaseGroupId = request.phaseGroupId;
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
         * PhaseGroupId.
         */
        public Builder phaseGroupId(String phaseGroupId) {
            this.putQueryParameter("PhaseGroupId", phaseGroupId);
            this.phaseGroupId = phaseGroupId;
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
        public ListMPCoSPhaseRequest build() {
            return new ListMPCoSPhaseRequest(this);
        } 

    } 

}
