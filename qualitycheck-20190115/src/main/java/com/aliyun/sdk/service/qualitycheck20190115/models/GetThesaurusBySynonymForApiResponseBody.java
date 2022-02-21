// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThesaurusBySynonymForApiResponseBody} extends {@link TeaModel}
 *
 * <p>GetThesaurusBySynonymForApiResponseBody</p>
 */
public class GetThesaurusBySynonymForApiResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetThesaurusBySynonymForApiResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThesaurusBySynonymForApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetThesaurusBySynonymForApiResponseBody build() {
            return new GetThesaurusBySynonymForApiResponseBody(this);
        } 

    } 

    public static class SynonymList extends TeaModel {
        @NameInMap("SynonymList")
        private java.util.List < String > synonymList;

        private SynonymList(Builder builder) {
            this.synonymList = builder.synonymList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynonymList create() {
            return builder().build();
        }

        /**
         * @return synonymList
         */
        public java.util.List < String > getSynonymList() {
            return this.synonymList;
        }

        public static final class Builder {
            private java.util.List < String > synonymList; 

            /**
             * SynonymList.
             */
            public Builder synonymList(java.util.List < String > synonymList) {
                this.synonymList = synonymList;
                return this;
            }

            public SynonymList build() {
                return new SynonymList(this);
            } 

        } 

    }
    public static class ThesaurusPo extends TeaModel {
        @NameInMap("Business")
        private String business;

        @NameInMap("Id")
        private Long id;

        @NameInMap("SynonymList")
        private SynonymList synonymList;

        private ThesaurusPo(Builder builder) {
            this.business = builder.business;
            this.id = builder.id;
            this.synonymList = builder.synonymList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThesaurusPo create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return synonymList
         */
        public SynonymList getSynonymList() {
            return this.synonymList;
        }

        public static final class Builder {
            private String business; 
            private Long id; 
            private SynonymList synonymList; 

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SynonymList.
             */
            public Builder synonymList(SynonymList synonymList) {
                this.synonymList = synonymList;
                return this;
            }

            public ThesaurusPo build() {
                return new ThesaurusPo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ThesaurusPo")
        private java.util.List < ThesaurusPo> thesaurusPo;

        private Data(Builder builder) {
            this.thesaurusPo = builder.thesaurusPo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return thesaurusPo
         */
        public java.util.List < ThesaurusPo> getThesaurusPo() {
            return this.thesaurusPo;
        }

        public static final class Builder {
            private java.util.List < ThesaurusPo> thesaurusPo; 

            /**
             * ThesaurusPo.
             */
            public Builder thesaurusPo(java.util.List < ThesaurusPo> thesaurusPo) {
                this.thesaurusPo = thesaurusPo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
