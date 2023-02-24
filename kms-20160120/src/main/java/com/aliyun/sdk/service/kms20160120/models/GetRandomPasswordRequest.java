// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRandomPasswordRequest} extends {@link RequestModel}
 *
 * <p>GetRandomPasswordRequest</p>
 */
public class GetRandomPasswordRequest extends Request {
    @Query
    @NameInMap("ExcludeCharacters")
    private String excludeCharacters;

    @Query
    @NameInMap("ExcludeLowercase")
    private String excludeLowercase;

    @Query
    @NameInMap("ExcludeNumbers")
    private String excludeNumbers;

    @Query
    @NameInMap("ExcludePunctuation")
    private String excludePunctuation;

    @Query
    @NameInMap("ExcludeUppercase")
    private String excludeUppercase;

    @Query
    @NameInMap("PasswordLength")
    private String passwordLength;

    @Query
    @NameInMap("RequireEachIncludedType")
    private String requireEachIncludedType;

    private GetRandomPasswordRequest(Builder builder) {
        super(builder);
        this.excludeCharacters = builder.excludeCharacters;
        this.excludeLowercase = builder.excludeLowercase;
        this.excludeNumbers = builder.excludeNumbers;
        this.excludePunctuation = builder.excludePunctuation;
        this.excludeUppercase = builder.excludeUppercase;
        this.passwordLength = builder.passwordLength;
        this.requireEachIncludedType = builder.requireEachIncludedType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRandomPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeCharacters
     */
    public String getExcludeCharacters() {
        return this.excludeCharacters;
    }

    /**
     * @return excludeLowercase
     */
    public String getExcludeLowercase() {
        return this.excludeLowercase;
    }

    /**
     * @return excludeNumbers
     */
    public String getExcludeNumbers() {
        return this.excludeNumbers;
    }

    /**
     * @return excludePunctuation
     */
    public String getExcludePunctuation() {
        return this.excludePunctuation;
    }

    /**
     * @return excludeUppercase
     */
    public String getExcludeUppercase() {
        return this.excludeUppercase;
    }

    /**
     * @return passwordLength
     */
    public String getPasswordLength() {
        return this.passwordLength;
    }

    /**
     * @return requireEachIncludedType
     */
    public String getRequireEachIncludedType() {
        return this.requireEachIncludedType;
    }

    public static final class Builder extends Request.Builder<GetRandomPasswordRequest, Builder> {
        private String excludeCharacters; 
        private String excludeLowercase; 
        private String excludeNumbers; 
        private String excludePunctuation; 
        private String excludeUppercase; 
        private String passwordLength; 
        private String requireEachIncludedType; 

        private Builder() {
            super();
        } 

        private Builder(GetRandomPasswordRequest request) {
            super(request);
            this.excludeCharacters = request.excludeCharacters;
            this.excludeLowercase = request.excludeLowercase;
            this.excludeNumbers = request.excludeNumbers;
            this.excludePunctuation = request.excludePunctuation;
            this.excludeUppercase = request.excludeUppercase;
            this.passwordLength = request.passwordLength;
            this.requireEachIncludedType = request.requireEachIncludedType;
        } 

        /**
         * The characters that are not included in the password to be generated.
         * <p>
         * 
         * Valid values:
         * 
         * ` Valid characters: 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ! \"#$%&\"()*+,-. /:;<=>? @[\] your_project_id} ~  `.
         * 
         * This parameter is empty by default.
         */
        public Builder excludeCharacters(String excludeCharacters) {
            this.putQueryParameter("ExcludeCharacters", excludeCharacters);
            this.excludeCharacters = excludeCharacters;
            return this;
        }

        /**
         * Specifies whether to exclude lowercase letters.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder excludeLowercase(String excludeLowercase) {
            this.putQueryParameter("ExcludeLowercase", excludeLowercase);
            this.excludeLowercase = excludeLowercase;
            return this;
        }

        /**
         * Specifies whether to exclude digits.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder excludeNumbers(String excludeNumbers) {
            this.putQueryParameter("ExcludeNumbers", excludeNumbers);
            this.excludeNumbers = excludeNumbers;
            return this;
        }

        /**
         * Specifies whether to exclude special characters.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder excludePunctuation(String excludePunctuation) {
            this.putQueryParameter("ExcludePunctuation", excludePunctuation);
            this.excludePunctuation = excludePunctuation;
            return this;
        }

        /**
         * Specifies whether to exclude uppercase letters.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder excludeUppercase(String excludeUppercase) {
            this.putQueryParameter("ExcludeUppercase", excludeUppercase);
            this.excludeUppercase = excludeUppercase;
            return this;
        }

        /**
         * The number of bytes that the password to be generated contains.
         * <p>
         * 
         * Valid values: 8 to 128.
         * 
         * Default value: 32
         */
        public Builder passwordLength(String passwordLength) {
            this.putQueryParameter("PasswordLength", passwordLength);
            this.passwordLength = passwordLength;
            return this;
        }

        /**
         * Specifies whether to include all the preceding character types.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * *   false
         */
        public Builder requireEachIncludedType(String requireEachIncludedType) {
            this.putQueryParameter("RequireEachIncludedType", requireEachIncludedType);
            this.requireEachIncludedType = requireEachIncludedType;
            return this;
        }

        @Override
        public GetRandomPasswordRequest build() {
            return new GetRandomPasswordRequest(this);
        } 

    } 

}
