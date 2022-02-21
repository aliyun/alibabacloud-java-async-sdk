// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
    @NameInMap("AdminRamId")
    private java.util.List < String > adminRamId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("PhoneNumbers")
    private java.util.List < String > phoneNumbers;

    @Query
    @NameInMap("StorageMaxDays")
    @Validation(required = true)
    private Integer storageMaxDays;

    @Query
    @NameInMap("StorageMaxSize")
    @Validation(required = true)
    private Integer storageMaxSize;

    @Query
    @NameInMap("UserObject")
    private java.util.List < String > userObject;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.adminRamId = builder.adminRamId;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumbers = builder.phoneNumbers;
        this.storageMaxDays = builder.storageMaxDays;
        this.storageMaxSize = builder.storageMaxSize;
        this.userObject = builder.userObject;
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
     * @return adminRamId
     */
    public java.util.List < String > getAdminRamId() {
        return this.adminRamId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List < String > getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return storageMaxDays
     */
    public Integer getStorageMaxDays() {
        return this.storageMaxDays;
    }

    /**
     * @return storageMaxSize
     */
    public Integer getStorageMaxSize() {
        return this.storageMaxSize;
    }

    /**
     * @return userObject
     */
    public java.util.List < String > getUserObject() {
        return this.userObject;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private java.util.List < String > adminRamId; 
        private String description; 
        private String directoryId; 
        private String domainName; 
        private String name; 
        private String phoneNumber; 
        private java.util.List < String > phoneNumbers; 
        private Integer storageMaxDays; 
        private Integer storageMaxSize; 
        private java.util.List < String > userObject; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.adminRamId = response.adminRamId;
            this.description = response.description;
            this.directoryId = response.directoryId;
            this.domainName = response.domainName;
            this.name = response.name;
            this.phoneNumber = response.phoneNumber;
            this.phoneNumbers = response.phoneNumbers;
            this.storageMaxDays = response.storageMaxDays;
            this.storageMaxSize = response.storageMaxSize;
            this.userObject = response.userObject;
        } 

        /**
         * AdminRamId.
         */
        public Builder adminRamId(java.util.List < String > adminRamId) {
            this.putQueryParameter("AdminRamId", adminRamId);
            this.adminRamId = adminRamId;
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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
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
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * PhoneNumbers.
         */
        public Builder phoneNumbers(java.util.List < String > phoneNumbers) {
            this.putQueryParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * StorageMaxDays.
         */
        public Builder storageMaxDays(Integer storageMaxDays) {
            this.putQueryParameter("StorageMaxDays", storageMaxDays);
            this.storageMaxDays = storageMaxDays;
            return this;
        }

        /**
         * StorageMaxSize.
         */
        public Builder storageMaxSize(Integer storageMaxSize) {
            this.putQueryParameter("StorageMaxSize", storageMaxSize);
            this.storageMaxSize = storageMaxSize;
            return this;
        }

        /**
         * UserObject.
         */
        public Builder userObject(java.util.List < String > userObject) {
            this.putQueryParameter("UserObject", userObject);
            this.userObject = userObject;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
