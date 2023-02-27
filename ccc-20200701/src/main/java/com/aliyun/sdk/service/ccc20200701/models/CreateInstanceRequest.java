// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
    @NameInMap("AdminRamIdList")
    @Validation(required = true)
    private String adminRamIdList;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NumberList")
    @Validation(required = true)
    private String numberList;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.adminRamIdList = builder.adminRamIdList;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.numberList = builder.numberList;
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
     * @return adminRamIdList
     */
    public String getAdminRamIdList() {
        return this.adminRamIdList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String adminRamIdList; 
        private String description; 
        private String domainName; 
        private String name; 
        private String numberList; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.adminRamIdList = request.adminRamIdList;
            this.description = request.description;
            this.domainName = request.domainName;
            this.name = request.name;
            this.numberList = request.numberList;
        } 

        /**
         * AdminRamIdList.
         */
        public Builder adminRamIdList(String adminRamIdList) {
            this.putQueryParameter("AdminRamIdList", adminRamIdList);
            this.adminRamIdList = adminRamIdList;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
