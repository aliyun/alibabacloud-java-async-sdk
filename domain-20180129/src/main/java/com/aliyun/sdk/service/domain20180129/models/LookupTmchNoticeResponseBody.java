// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LookupTmchNoticeResponseBody} extends {@link TeaModel}
 *
 * <p>LookupTmchNoticeResponseBody</p>
 */
public class LookupTmchNoticeResponseBody extends TeaModel {
    @NameInMap("Claims")
    private Claims claims;

    @NameInMap("Id")
    private Long id;

    @NameInMap("Label")
    private String label;

    @NameInMap("NotAfter")
    private String notAfter;

    @NameInMap("NotBefore")
    private String notBefore;

    @NameInMap("RequestId")
    private String requestId;

    private LookupTmchNoticeResponseBody(Builder builder) {
        this.claims = builder.claims;
        this.id = builder.id;
        this.label = builder.label;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LookupTmchNoticeResponseBody create() {
        return builder().build();
    }

    /**
     * @return claims
     */
    public Claims getClaims() {
        return this.claims;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Claims claims; 
        private Long id; 
        private String label; 
        private String notAfter; 
        private String notBefore; 
        private String requestId; 

        /**
         * Claims.
         */
        public Builder claims(Claims claims) {
            this.claims = claims;
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
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LookupTmchNoticeResponseBody build() {
            return new LookupTmchNoticeResponseBody(this);
        } 

    } 

    public static class ClassDesc extends TeaModel {
        @NameInMap("ClassNum")
        private Integer classNum;

        @NameInMap("Desc")
        private String desc;

        private ClassDesc(Builder builder) {
            this.classNum = builder.classNum;
            this.desc = builder.desc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassDesc create() {
            return builder().build();
        }

        /**
         * @return classNum
         */
        public Integer getClassNum() {
            return this.classNum;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        public static final class Builder {
            private Integer classNum; 
            private String desc; 

            /**
             * ClassNum.
             */
            public Builder classNum(Integer classNum) {
                this.classNum = classNum;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            public ClassDesc build() {
                return new ClassDesc(this);
            } 

        } 

    }
    public static class ClassDescs extends TeaModel {
        @NameInMap("ClassDesc")
        private java.util.List < ClassDesc> classDesc;

        private ClassDescs(Builder builder) {
            this.classDesc = builder.classDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassDescs create() {
            return builder().build();
        }

        /**
         * @return classDesc
         */
        public java.util.List < ClassDesc> getClassDesc() {
            return this.classDesc;
        }

        public static final class Builder {
            private java.util.List < ClassDesc> classDesc; 

            /**
             * ClassDesc.
             */
            public Builder classDesc(java.util.List < ClassDesc> classDesc) {
                this.classDesc = classDesc;
                return this;
            }

            public ClassDescs build() {
                return new ClassDescs(this);
            } 

        } 

    }
    public static class Street extends TeaModel {
        @NameInMap("Street")
        private java.util.List < String > street;

        private Street(Builder builder) {
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Street create() {
            return builder().build();
        }

        /**
         * @return street
         */
        public java.util.List < String > getStreet() {
            return this.street;
        }

        public static final class Builder {
            private java.util.List < String > street; 

            /**
             * Street.
             */
            public Builder street(java.util.List < String > street) {
                this.street = street;
                return this;
            }

            public Street build() {
                return new Street(this);
            } 

        } 

    }
    public static class Addr extends TeaModel {
        @NameInMap("Cc")
        private String cc;

        @NameInMap("City")
        private String city;

        @NameInMap("Pc")
        private String pc;

        @NameInMap("Sp")
        private String sp;

        @NameInMap("Street")
        private Street street;

        private Addr(Builder builder) {
            this.cc = builder.cc;
            this.city = builder.city;
            this.pc = builder.pc;
            this.sp = builder.sp;
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return cc
         */
        public String getCc() {
            return this.cc;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return pc
         */
        public String getPc() {
            return this.pc;
        }

        /**
         * @return sp
         */
        public String getSp() {
            return this.sp;
        }

        /**
         * @return street
         */
        public Street getStreet() {
            return this.street;
        }

        public static final class Builder {
            private String cc; 
            private String city; 
            private String pc; 
            private String sp; 
            private Street street; 

            /**
             * Cc.
             */
            public Builder cc(String cc) {
                this.cc = cc;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Pc.
             */
            public Builder pc(String pc) {
                this.pc = pc;
                return this;
            }

            /**
             * Sp.
             */
            public Builder sp(String sp) {
                this.sp = sp;
                return this;
            }

            /**
             * Street.
             */
            public Builder street(Street street) {
                this.street = street;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("Addr")
        private Addr addr;

        @NameInMap("Email")
        private String email;

        @NameInMap("Fax")
        private String fax;

        @NameInMap("Name")
        private String name;

        @NameInMap("Org")
        private String org;

        @NameInMap("Type")
        private String type;

        @NameInMap("Voice")
        private String voice;

        private Contact(Builder builder) {
            this.addr = builder.addr;
            this.email = builder.email;
            this.fax = builder.fax;
            this.name = builder.name;
            this.org = builder.org;
            this.type = builder.type;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public Addr getAddr() {
            return this.addr;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return fax
         */
        public String getFax() {
            return this.fax;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return org
         */
        public String getOrg() {
            return this.org;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private Addr addr; 
            private String email; 
            private String fax; 
            private String name; 
            private String org; 
            private String type; 
            private String voice; 

            /**
             * Addr.
             */
            public Builder addr(Addr addr) {
                this.addr = addr;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Fax.
             */
            public Builder fax(String fax) {
                this.fax = fax;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Org.
             */
            public Builder org(String org) {
                this.org = org;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Voice.
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class Contacts extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < Contact> contact;

        private Contacts(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contacts create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List < Contact> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < Contact> contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < Contact> contact) {
                this.contact = contact;
                return this;
            }

            public Contacts build() {
                return new Contacts(this);
            } 

        } 

    }
    public static class AddrStreet extends TeaModel {
        @NameInMap("Street")
        private java.util.List < String > street;

        private AddrStreet(Builder builder) {
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrStreet create() {
            return builder().build();
        }

        /**
         * @return street
         */
        public java.util.List < String > getStreet() {
            return this.street;
        }

        public static final class Builder {
            private java.util.List < String > street; 

            /**
             * Street.
             */
            public Builder street(java.util.List < String > street) {
                this.street = street;
                return this;
            }

            public AddrStreet build() {
                return new AddrStreet(this);
            } 

        } 

    }
    public static class HolderAddr extends TeaModel {
        @NameInMap("Cc")
        private String cc;

        @NameInMap("City")
        private String city;

        @NameInMap("Pc")
        private String pc;

        @NameInMap("Sp")
        private String sp;

        @NameInMap("Street")
        private AddrStreet street;

        private HolderAddr(Builder builder) {
            this.cc = builder.cc;
            this.city = builder.city;
            this.pc = builder.pc;
            this.sp = builder.sp;
            this.street = builder.street;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HolderAddr create() {
            return builder().build();
        }

        /**
         * @return cc
         */
        public String getCc() {
            return this.cc;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return pc
         */
        public String getPc() {
            return this.pc;
        }

        /**
         * @return sp
         */
        public String getSp() {
            return this.sp;
        }

        /**
         * @return street
         */
        public AddrStreet getStreet() {
            return this.street;
        }

        public static final class Builder {
            private String cc; 
            private String city; 
            private String pc; 
            private String sp; 
            private AddrStreet street; 

            /**
             * Cc.
             */
            public Builder cc(String cc) {
                this.cc = cc;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Pc.
             */
            public Builder pc(String pc) {
                this.pc = pc;
                return this;
            }

            /**
             * Sp.
             */
            public Builder sp(String sp) {
                this.sp = sp;
                return this;
            }

            /**
             * Street.
             */
            public Builder street(AddrStreet street) {
                this.street = street;
                return this;
            }

            public HolderAddr build() {
                return new HolderAddr(this);
            } 

        } 

    }
    public static class Holder extends TeaModel {
        @NameInMap("Addr")
        private HolderAddr addr;

        @NameInMap("Entitlement")
        private String entitlement;

        @NameInMap("Org")
        private String org;

        private Holder(Builder builder) {
            this.addr = builder.addr;
            this.entitlement = builder.entitlement;
            this.org = builder.org;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Holder create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public HolderAddr getAddr() {
            return this.addr;
        }

        /**
         * @return entitlement
         */
        public String getEntitlement() {
            return this.entitlement;
        }

        /**
         * @return org
         */
        public String getOrg() {
            return this.org;
        }

        public static final class Builder {
            private HolderAddr addr; 
            private String entitlement; 
            private String org; 

            /**
             * Addr.
             */
            public Builder addr(HolderAddr addr) {
                this.addr = addr;
                return this;
            }

            /**
             * Entitlement.
             */
            public Builder entitlement(String entitlement) {
                this.entitlement = entitlement;
                return this;
            }

            /**
             * Org.
             */
            public Builder org(String org) {
                this.org = org;
                return this;
            }

            public Holder build() {
                return new Holder(this);
            } 

        } 

    }
    public static class Holders extends TeaModel {
        @NameInMap("Holder")
        private java.util.List < Holder> holder;

        private Holders(Builder builder) {
            this.holder = builder.holder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Holders create() {
            return builder().build();
        }

        /**
         * @return holder
         */
        public java.util.List < Holder> getHolder() {
            return this.holder;
        }

        public static final class Builder {
            private java.util.List < Holder> holder; 

            /**
             * Holder.
             */
            public Builder holder(java.util.List < Holder> holder) {
                this.holder = holder;
                return this;
            }

            public Holders build() {
                return new Holders(this);
            } 

        } 

    }
    public static class JurDesc extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("JurCC")
        private String jurCC;

        private JurDesc(Builder builder) {
            this.desc = builder.desc;
            this.jurCC = builder.jurCC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JurDesc create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return jurCC
         */
        public String getJurCC() {
            return this.jurCC;
        }

        public static final class Builder {
            private String desc; 
            private String jurCC; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * JurCC.
             */
            public Builder jurCC(String jurCC) {
                this.jurCC = jurCC;
                return this;
            }

            public JurDesc build() {
                return new JurDesc(this);
            } 

        } 

    }
    public static class Claim extends TeaModel {
        @NameInMap("ClassDescs")
        private ClassDescs classDescs;

        @NameInMap("Contacts")
        private Contacts contacts;

        @NameInMap("GoodsAndServices")
        private String goodsAndServices;

        @NameInMap("Holders")
        private Holders holders;

        @NameInMap("JurDesc")
        private JurDesc jurDesc;

        @NameInMap("MarkName")
        private String markName;

        private Claim(Builder builder) {
            this.classDescs = builder.classDescs;
            this.contacts = builder.contacts;
            this.goodsAndServices = builder.goodsAndServices;
            this.holders = builder.holders;
            this.jurDesc = builder.jurDesc;
            this.markName = builder.markName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Claim create() {
            return builder().build();
        }

        /**
         * @return classDescs
         */
        public ClassDescs getClassDescs() {
            return this.classDescs;
        }

        /**
         * @return contacts
         */
        public Contacts getContacts() {
            return this.contacts;
        }

        /**
         * @return goodsAndServices
         */
        public String getGoodsAndServices() {
            return this.goodsAndServices;
        }

        /**
         * @return holders
         */
        public Holders getHolders() {
            return this.holders;
        }

        /**
         * @return jurDesc
         */
        public JurDesc getJurDesc() {
            return this.jurDesc;
        }

        /**
         * @return markName
         */
        public String getMarkName() {
            return this.markName;
        }

        public static final class Builder {
            private ClassDescs classDescs; 
            private Contacts contacts; 
            private String goodsAndServices; 
            private Holders holders; 
            private JurDesc jurDesc; 
            private String markName; 

            /**
             * ClassDescs.
             */
            public Builder classDescs(ClassDescs classDescs) {
                this.classDescs = classDescs;
                return this;
            }

            /**
             * Contacts.
             */
            public Builder contacts(Contacts contacts) {
                this.contacts = contacts;
                return this;
            }

            /**
             * GoodsAndServices.
             */
            public Builder goodsAndServices(String goodsAndServices) {
                this.goodsAndServices = goodsAndServices;
                return this;
            }

            /**
             * Holders.
             */
            public Builder holders(Holders holders) {
                this.holders = holders;
                return this;
            }

            /**
             * JurDesc.
             */
            public Builder jurDesc(JurDesc jurDesc) {
                this.jurDesc = jurDesc;
                return this;
            }

            /**
             * MarkName.
             */
            public Builder markName(String markName) {
                this.markName = markName;
                return this;
            }

            public Claim build() {
                return new Claim(this);
            } 

        } 

    }
    public static class Claims extends TeaModel {
        @NameInMap("Claim")
        private java.util.List < Claim> claim;

        private Claims(Builder builder) {
            this.claim = builder.claim;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Claims create() {
            return builder().build();
        }

        /**
         * @return claim
         */
        public java.util.List < Claim> getClaim() {
            return this.claim;
        }

        public static final class Builder {
            private java.util.List < Claim> claim; 

            /**
             * Claim.
             */
            public Builder claim(java.util.List < Claim> claim) {
                this.claim = claim;
                return this;
            }

            public Claims build() {
                return new Claims(this);
            } 

        } 

    }
}
